package xyz.easy_coding.geotools.data;

import org.geotools.data.DataAccessFactory.Param;

public class DynamoDBParam {
	static final Param TABLE_NAME = new Param("table name", String.class, "DynamoDB table name which is used datasource.", true);
	static final Param ACCESS_KEY = new Param("access key", String.class, "IAM user accessKey", false);
	static final Param SECRET_ACCESS_KEY = new Param("secret access key", String.class, "IAM user secretAccessKey", false);
	static final Param[] ALL = new Param[]{
			TABLE_NAME,
			ACCESS_KEY,
			SECRET_ACCESS_KEY
	};
}
