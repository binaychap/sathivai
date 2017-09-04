package org.codebhatti.sathivai.config

/**
 * Created by binayrai on 9/3/17.
 */
class DataSource {
    String server
    Integer port

    DataSource(){}

    DataSource(String server, Integer port) {
        this.server = server
        this.port = port
    }

    @Override
    String toString() {
        return "DataSource{" +
                "server='" + server + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
