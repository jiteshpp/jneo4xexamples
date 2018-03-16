/**
 * 
 */
package com.example.configuration;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;

/**
 * @author JiteshP
 *
 */
public class Neo4jConfiguration {

	public static Driver getNeoConnection() {
		final String uri = "bolt://localhost:7687";
		final String user = "neo4j";
		final String password = "beewiseadmin";
		return GraphDatabase.driver(uri, AuthTokens.basic(user, password));
	}
}
