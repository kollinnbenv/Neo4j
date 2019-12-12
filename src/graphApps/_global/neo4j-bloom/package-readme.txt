What Is This?
-------------

This archive contains:
1) a Neo4j server plugin for Bloom (.jar file) that enables perspective sharing 
   and also hosts the Bloom web browser client on the Neo4j server itself, and
2) the Bloom web application asset bundle (.zip file) for hosting it from an
   independent web server.


How Do I Use It?
----------------

The Neo4j Bloom plugin (the .jar file) needs to be installed in the plugins/
directory of your Neo4j database instance / instances. There are also a number
of configuration parameters that need to be set depending on what features of
the plugin you want to use. The plugin will also need a license file to 
work. For details about these settings, refer to the Neo4j Bloom documentation 
at https://neo4j.com/docs/.


In case you want to host Neo4j Bloom from an independent web server
-------------------------------------------------------------------

The web application asset bundle (the .zip file) can be hosted with 
a web server of your choice. You will also need to edit the file discovery.json
to point to the Neo4j database instance you will be using. Refer to Neo4j Bloom
documentation at https://neo4j.com/docs/ for details about editing the file.

