
# Application des gestion des ressources en CLI — Prototype Modulaire

Application Java en ligne de commande (CLI) pour interagir avec une base de données PostgreSQL selon une architecture modulaire. Ce projet est un prototype du système **SIGGEAC**, respectant les bonnes pratiques de découplage, typage strict, anti-injection, et documentation automatisée.

---

## 📦 Structure du projet


siggeac-cli/

├── src/

│   └── main/

│       ├── java/siggeac/       # Code source principal

│       │   ├── config/         # Connexion JDBC

│       │   ├── core/           # Gestion des rôles, sécurité

│       │   ├── etudiants/      # Module étudiants

│       │   ├── professeurs/    # Module professeurs

│       │   ├── services/       # Module services

│       └── resources/

│           └── schemaspy.properties

├── tools/                      # outils externes (SchemaSpy, etc.)

├── docs/                       # Documentation générée

├── gen_schemaspy.sh            # Script pour SchemaSpy

├── pom.xml                     # Dépendances Maven + jOOQ

└── README.md


---
## ⚙️ Technologies utilisées

- Java 17
- PostgreSQL 17+
- JDBC
- jOOQ 3.20.4
- SchemaSpy 6.2.4
- Maven
---
## 🚀 Exécution CLI

### Compilation

```bash
mvn clean compile
```


### Lancer l'application (exemple)

```
src/main/resources/application.properties

```

> ⚠️ Il faut d'abord configurer `application.properties` pour la connexion JDBC.



## 🔌 Connexion à la base

Configurer les informations de base de données dans :

```
src/main/resources/application.properties

```

Exemple :

```
db.url=jdbc:postgresql://localhost:5432/siggeac
db.user=siggeac_user
db.password=secret

```

💾 Génération de code jOOQ

```
mvn clean generate-sources

```

Le code est généré dans `target/generated-sources/jooq` et utilisé dans les DAO typés.


## 📚 Génération de la documentation avec SchemaSpy

### Pré-requis

* Avoir `schemaspy-6.2.x.jar` dans le dossier `tools/`
* Avoir le driver PostgreSQL déjà téléchargé (via Maven par exemple)

### Script d’exécution

```
./gen_schemaspy.sh sch_etudiants

```

La documentation sera générée dans :

```
src/main/resources/docs/schemaspy
```


## 🔐 Sécurité

Le projet utilise un système de **rôles applicatifs** simulés :

* CONSULTATION
* MODIFICATION
* ADMIN

Et des **permissions par domaine** :

* ETUDIANTS
* PROFESSEURS
* SERVICES

Voir : `core/SecurityManager.java`

---

## 🧪 Jeux de test

À implémenter dans les classes CLI (ex : `EtudiantCLI`) avec des données injectées ou via un script SQL de seed.

---

## 📄 Licence

Projet pédagogique — [CC BY-NC-SA 4.0]()
