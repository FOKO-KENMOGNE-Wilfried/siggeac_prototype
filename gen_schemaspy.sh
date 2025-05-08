#!/bin/bash
# gen_schemaspy.sh
# Usage: ./gen_schemaspy.sh sch_etudiants

SCHEMA=$1

if [ -z "$SCHEMA" ]; then
    echo "❌ Specify schema (ex: sch_etudiants)"
    exit 1
fi

echo "📄 Generating documentation for schema: $SCHEMA"
echo "📁 Output will go to: docs/schemaspy"

java -jar tools/schemaspy-6.2.4.jar \
    -configFile src/main/resources/schemaspy.properties \
    -s "$SCHEMA"

if [ $? -eq 0 ]; then
    echo "✅ Documentation generated successfully for $SCHEMA"
else
    echo "❌ An error occurred during documentation generation"
    exit 2
fi


# java -jar tools/schemaspy-6.2.4.jar \
#   -t pgsql \
#   -dp tools/postgresql-42.7.5.jar \
#   -host localhost \
#   -port 5432 \
#   -db test_db \
#   -s public \
#   -u postgres \
#   -p secret \
#   -o docs/schemaspy/etudiants