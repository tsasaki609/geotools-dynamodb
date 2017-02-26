package xyz.easy_coding.geotools.data;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

import org.geotools.data.DataStore;
import org.geotools.data.DataStoreFactorySpi;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException;
import com.amazonaws.services.dynamodbv2.model.TableDescription;

public class DynamoDBDataStoreFactory implements DataStoreFactorySpi {

	public boolean canProcess(Map<String, Serializable> params) {
		// TODO check parameter
		if(params == null) {
			return false;
		}

		return true;
	}

	public String getDescription() {
		return "GeoTools DynamoDB extension which provided by easy-coding.xyz";
	}

	public String getDisplayName() {
		return "DynamoDB";
	}

	public Param[] getParametersInfo() {
		return DynamoDBParam.ALL;
	}

	public boolean isAvailable() {
		//required all jar into package fat jar, so return true every time.
		return true;
	}

	public Map<Key, ?> getImplementationHints() {
		return Collections.emptyMap();
	}

	public DataStore createDataStore(Map<String, Serializable> params) throws IOException {
		String tableName = params.get(DynamoDBParam.TABLE_NAME.key).toString();
		Table storeTable = new DynamoDB(AmazonDynamoDBClient.builder().build()).getTable(tableName);
		try {
		TableDescription description = storeTable.describe();
		//TODO validate table
		} catch(ResourceNotFoundException e) {
			//TODO create table
		}

		return new DynamoDBDataStore(storeTable);
	}

	public DataStore createNewDataStore(Map<String, Serializable> params) throws IOException {
		return createDataStore(params);
	}

}
