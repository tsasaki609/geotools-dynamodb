package xyz.easy_coding.opengis.feature.simple;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.opengis.feature.GeometryAttribute;
import org.opengis.feature.IllegalAttributeException;
import org.opengis.feature.Property;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;
import org.opengis.feature.type.AttributeDescriptor;
import org.opengis.feature.type.Name;
import org.opengis.filter.identity.FeatureId;
import org.opengis.geometry.BoundingBox;

public class DynamoDBSimpleFeature implements SimpleFeature {

	public FeatureId getIdentifier() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public BoundingBox getBounds() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public GeometryAttribute getDefaultGeometryProperty() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public void setDefaultGeometryProperty(GeometryAttribute geometryAttribute) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public void setValue(Collection<Property> values) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public Collection<? extends Property> getValue() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Collection<Property> getProperties(Name name) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Property getProperty(Name name) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Collection<Property> getProperties(String name) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Collection<Property> getProperties() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Property getProperty(String name) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public void validate() throws IllegalAttributeException {
		// TODO 自動生成されたメソッド・スタブ

	}

	public AttributeDescriptor getDescriptor() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public void setValue(Object newValue) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public Name getName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public boolean isNillable() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	public Map<Object, Object> getUserData() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getID() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public SimpleFeatureType getType() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public SimpleFeatureType getFeatureType() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public List<Object> getAttributes() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public void setAttributes(List<Object> values) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public void setAttributes(Object[] values) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public Object getAttribute(String name) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public void setAttribute(String name, Object value) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public Object getAttribute(Name name) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public void setAttribute(Name name, Object value) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public Object getAttribute(int index) throws IndexOutOfBoundsException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public void setAttribute(int index, Object value) throws IndexOutOfBoundsException {
		// TODO 自動生成されたメソッド・スタブ

	}

	public int getAttributeCount() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	public Object getDefaultGeometry() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public void setDefaultGeometry(Object geometry) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
