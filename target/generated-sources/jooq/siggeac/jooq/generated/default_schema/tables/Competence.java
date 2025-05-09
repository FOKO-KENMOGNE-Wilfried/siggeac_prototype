/*
 * This file is generated by jOOQ.
 */
package siggeac.jooq.generated.default_schema.tables;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import siggeac.jooq.generated.default_schema.DefaultSchema;
import siggeac.jooq.generated.default_schema.Domains;
import siggeac.jooq.generated.default_schema.Keys;
import siggeac.jooq.generated.default_schema.tables.Cours.CoursPath;
import siggeac.jooq.generated.default_schema.tables.Professeur.ProfesseurPath;
import siggeac.jooq.generated.default_schema.tables.records.CompetenceRecord;


/**
 * La personne enseignante (identifiée par "matriculeP") a la compétence requise
 * pour assure le cours (identifié par le sigle "sigle"). 
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Competence extends TableImpl<CompetenceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>competence</code>
     */
    public static final Competence COMPETENCE = new Competence();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompetenceRecord> getRecordType() {
        return CompetenceRecord.class;
    }

    /**
     * The column <code>competence.sigle</code>.
     */
    public final TableField<CompetenceRecord, String> SIGLE = createField(DSL.name("sigle"), Domains.SIGLE.getDataType().nullable(false), this, "");

    /**
     * The column <code>competence.matriculep</code>.
     */
    public final TableField<CompetenceRecord, String> MATRICULEP = createField(DSL.name("matriculep"), Domains.MATRICULEP.getDataType().nullable(false), this, "");

    private Competence(Name alias, Table<CompetenceRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Competence(Name alias, Table<CompetenceRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("La personne enseignante (identifiée par \"matriculeP\") a la compétence requise pour assure le cours (identifié par le sigle \"sigle\"). "), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>competence</code> table reference
     */
    public Competence(String alias) {
        this(DSL.name(alias), COMPETENCE);
    }

    /**
     * Create an aliased <code>competence</code> table reference
     */
    public Competence(Name alias) {
        this(alias, COMPETENCE);
    }

    /**
     * Create a <code>competence</code> table reference
     */
    public Competence() {
        this(DSL.name("competence"), null);
    }

    public <O extends Record> Competence(Table<O> path, ForeignKey<O, CompetenceRecord> childPath, InverseForeignKey<O, CompetenceRecord> parentPath) {
        super(path, childPath, parentPath, COMPETENCE);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class CompetencePath extends Competence implements Path<CompetenceRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> CompetencePath(Table<O> path, ForeignKey<O, CompetenceRecord> childPath, InverseForeignKey<O, CompetenceRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private CompetencePath(Name alias, Table<CompetenceRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public CompetencePath as(String alias) {
            return new CompetencePath(DSL.name(alias), this);
        }

        @Override
        public CompetencePath as(Name alias) {
            return new CompetencePath(alias, this);
        }

        @Override
        public CompetencePath as(Table<?> alias) {
            return new CompetencePath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<CompetenceRecord> getPrimaryKey() {
        return Keys.COMPETENCE_CC0;
    }

    @Override
    public List<ForeignKey<CompetenceRecord, ?>> getReferences() {
        return Arrays.asList(Keys.COMPETENCE__COMPETENCE_CR0, Keys.COMPETENCE__COMPETENCE_CR1);
    }

    private transient CoursPath _cours;

    /**
     * Get the implicit join path to the <code>cours</code> table.
     */
    public CoursPath cours() {
        if (_cours == null)
            _cours = new CoursPath(this, Keys.COMPETENCE__COMPETENCE_CR0, null);

        return _cours;
    }

    private transient ProfesseurPath _professeur;

    /**
     * Get the implicit join path to the <code>professeur</code> table.
     */
    public ProfesseurPath professeur() {
        if (_professeur == null)
            _professeur = new ProfesseurPath(this, Keys.COMPETENCE__COMPETENCE_CR1, null);

        return _professeur;
    }

    @Override
    public Competence as(String alias) {
        return new Competence(DSL.name(alias), this);
    }

    @Override
    public Competence as(Name alias) {
        return new Competence(alias, this);
    }

    @Override
    public Competence as(Table<?> alias) {
        return new Competence(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Competence rename(String name) {
        return new Competence(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Competence rename(Name name) {
        return new Competence(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Competence rename(Table<?> name) {
        return new Competence(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Competence where(Condition condition) {
        return new Competence(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Competence where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Competence where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Competence where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Competence where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Competence where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Competence where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Competence where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Competence whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Competence whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
