package xyz.easy_coding.geotools.data;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

import org.geotools.data.DataStore;
import org.geotools.data.DataStoreFactorySpi;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;

public class DynamoDBDataStoreFactory implements DataStoreFactorySpi {

	public boolean canProcess(Map<String, Serializable> params) {
		// TODO check table name
		return true;
	}

	public String getDescription() {
		return "Amazon Web Service DynamoDB fully managed NoSQL database";
	}

	public String getDisplayName() {
		return "DynamoDB extension which provided by easy-coding.xyz";
	}

	public Param[] getParametersInfo() {
		return new Param[]{
				new Param("table name", String.class, "DynamoDB table name which is used datasource.", true),
				//new Param("region", String.class, "table existed region", true),
				new Param("access key", String.class, "IAM user accessKey", false),
				new Param("secret access key", String.class, "IAM user secretAccessKey", false),
				};
	}

	public boolean isAvailable() {
		return true;
	}

	public Map<Key, ?> getImplementationHints() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public DataStore createDataStore(Map<String, Serializable> params) throws IOException {
		return new DynamoDBDataStore(new DynamoDB(AmazonDynamoDBClient.builder().build()).getTable(params.get("table name").toString()));//TODO
	}

	public DataStore createNewDataStore(Map<String, Serializable> params) throws IOException {
		return new DynamoDBDataStore(new DynamoDB(AmazonDynamoDBClient.builder().build()).getTable(params.get("table name").toString()));//TODO
	}

}
