package xyz.easy_coding.geotools.data;

import java.io.IOException;

import org.geotools.data.FeatureReader;
import org.geotools.data.FeatureWriter;
import org.geotools.data.Query;
import org.geotools.data.store.ContentEntry;
import org.geotools.data.store.ContentFeatureStore;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

import com.amazonaws.services.dynamodbv2.document.Table;

public class DynamoDBFeatureStore extends ContentFeatureStore {

	private final Table storeTable;

	public DynamoDBFeatureStore(ContentEntry entry, Query query, Table storeTable) {
		super(entry, query);
		this.storeTable = storeTable;
	}

	@Override
	protected FeatureWriter<SimpleFeatureType, SimpleFeature> getWriterInternal(Query paramQuery, int paramInt) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	protected SimpleFeatureType buildFeatureType() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	protected ReferencedEnvelope getBoundsInternal(Query paramQuery) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	protected int getCountInternal(Query paramQuery) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	protected FeatureReader<SimpleFeatureType, SimpleFeature> getReaderInternal(Query paramQuery) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
