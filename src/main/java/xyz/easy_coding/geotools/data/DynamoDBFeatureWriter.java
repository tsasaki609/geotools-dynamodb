package xyz.easy_coding.geotools.data;

import java.io.IOException;

import org.geotools.data.FeatureWriter;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

import com.amazonaws.services.dynamodbv2.document.Table;

public class DynamoDBFeatureWriter implements FeatureWriter<SimpleFeatureType, SimpleFeature> {

	private final Table target;

	public DynamoDBFeatureWriter(Table target) {
		this.target = target;
	}

	public SimpleFeatureType getFeatureType() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public SimpleFeature next() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public void remove() throws IOException {
		// TODO 自動生成されたメソッド・スタブ

	}

	public void write() throws IOException {
		// TODO 自動生成されたメソッド・スタブ

	}

	public boolean hasNext() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	public void close() throws IOException {
		// TODO 自動生成されたメソッド・スタブ

	}

}
