package xyz.easy_coding.geotools.data;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.geotools.data.FeatureReader;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

import com.amazonaws.services.dynamodbv2.document.Table;

public class DynamoDBFeatureReader implements FeatureReader<SimpleFeatureType, SimpleFeature> {

	private final Table target;

	public DynamoDBFeatureReader(Table target) {
		this.target = target;
	}

	public void close() throws IOException {
		// TODO 自動生成されたメソッド・スタブ

	}

	public SimpleFeatureType getFeatureType() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public boolean hasNext() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	public SimpleFeature next() throws IOException, IllegalArgumentException,
			NoSuchElementException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
