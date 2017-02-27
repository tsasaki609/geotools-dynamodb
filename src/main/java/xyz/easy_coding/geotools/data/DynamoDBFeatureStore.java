package xyz.easy_coding.geotools.data;

import java.io.IOException;

import org.geotools.data.FeatureReader;
import org.geotools.data.FeatureWriter;
import org.geotools.data.Query;
import org.geotools.data.store.ContentEntry;
import org.geotools.data.store.ContentFeatureStore;
import org.geotools.feature.simple.SimpleFeatureTypeBuilder;
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
	protected FeatureWriter<SimpleFeatureType, SimpleFeature> getWriterInternal(Query query, int flags) throws IOException {
		if((flags | WRITER_ADD) == WRITER_ADD) {
			return new DynamoDBAddFeatureWriter(storeTable, query);
		} else if((flags | WRITER_UPDATE) == WRITER_UPDATE) {
			return new DynamoDBUpdateFeatureWriter(storeTable, query);
		} else {
			throw new IllegalArgumentException(String.format("flags is %d", flags));
		}
	}

	@Override
	protected SimpleFeatureType buildFeatureType() throws IOException {
		SimpleFeatureTypeBuilder b = new SimpleFeatureTypeBuilder();
		b.setFeatureTypeFactory(getDataStore().getFeatureTypeFactory());
		return b.buildFeatureType();
	}

	@Override
	protected ReferencedEnvelope getBoundsInternal(Query query) throws IOException {
		return new DynamoDBQuery(storeTable, query).getBounds();
	}

	@Override
	protected int getCountInternal(Query query) throws IOException {
		return new DynamoDBQuery(storeTable, query).getCount();
	}

	@Override
	protected FeatureReader<SimpleFeatureType, SimpleFeature> getReaderInternal(Query query) throws IOException {
		return new DynamoDBFeatureReader(storeTable, query);
	}

}
