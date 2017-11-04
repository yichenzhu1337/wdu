#!/usr/bin/env bash
mysql -u root -D flyway-test -e "DROP TABLE person, schema_version;"
mvn flyway:migrate