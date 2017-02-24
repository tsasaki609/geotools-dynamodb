package xyz.easy_coding.geotools.data;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.geotools.data.Query;
import org.geotools.data.store.ContentDataStore;
import org.geotools.data.store.ContentEntry;
import org.geotools.data.store.ContentFeatureSource;
import org.geotools.feature.NameImpl;
import org.opengis.feature.type.Name;

import com.amazonaws.services.dynamodbv2.document.Table;

public class DynamoDBDataStore extends ContentDataStore {

	private final Table storeTable;

	public DynamoDBDataStore(Table storeTable) {
		this.storeTable = storeTable;
	}

	@Override
	protected ContentFeatureSource createFeatureSource(ContentEntry entry) throws IOException {
		return new DynamoDBFeatureStore(entry, Query.ALL, storeTable);//TODO all?
	}

	@Override
	protected List<Name> createTypeNames() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String name = "hoge";
        name = name.substring(0, name.lastIndexOf('.'));

        Name typeName = new NameImpl( name );
        return Collections.singletonList(typeName);
	}

}
