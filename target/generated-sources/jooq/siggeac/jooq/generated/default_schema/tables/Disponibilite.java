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
import siggeac.jooq.generated.default_schema.tables.records.DisponibiliteRecord;


/**
 * La personne enseignante (identifiée par "matriculeP") est disponible pour
 * enseigner durant le trimestre "trimestre". 
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Disponibilite extends TableImpl<DisponibiliteRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>disponibilite</code>
     */
    public static final Disponibilite DISPONIBILITE = new Disponibilite();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DisponibiliteRecord> getRecordType() {
        return DisponibiliteRecord.class;
    }

    /**
     * The column <code>disponibilite.trimestre</code>.
     */
    public final TableField<DisponibiliteRecord, String> TRIMESTRE = createField(DSL.name("trimestre"), Domains.TRIMESTRE.getDataType().nullable(false), this, "");

    /**
     * The column <code>disponibilite.matriculep</code>.
     */
    public final TableField<DisponibiliteRecord, String> MATRICULEP = createField(DSL.name("matriculep"), Domains.MATRICULEP.getDataType().nullable(false), this, "");

    private Disponibilite(Name alias, Table<DisponibiliteRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Disponibilite(Name alias, Table<DisponibiliteRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("La personne enseignante (identifiée par \"matriculeP\") est disponible pour enseigner durant le trimestre \"trimestre\". "), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>disponibilite</code> table reference
     */
    public Disponibilite(String alias) {
        this(DSL.name(alias), DISPONIBILITE);
    }

    /**
     * Create an aliased <code>disponibilite</code> table reference
     */
    public Disponibilite(Name alias) {
        this(alias, DISPONIBILITE);
    }

    /**
     * Create a <code>disponibilite</code> table reference
     */
    public Disponibilite() {
        this(DSL.name("disponibilite"), null);
    }

    public <O extends Record> Disponibilite(Table<O> path, ForeignKey<O, DisponibiliteRecord> childPath, InverseForeignKey<O, DisponibiliteRecord> parentPath) {
        super(path, childPath, parentPath, DISPONIBILITE);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class DisponibilitePath extends Disponibilite implements Path<DisponibiliteRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> DisponibilitePath(Table<O> path, ForeignKey<O, DisponibiliteRecord> childPath, InverseForeignKey<O, DisponibiliteRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private DisponibilitePath(Name alias, Table<DisponibiliteRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public DisponibilitePath as(String alias) {
            return new DisponibilitePath(DSL.name(alias), this);
        }

        @Override
        public DisponibilitePath as(Name alias) {
            return new DisponibilitePath(alias, this);
        }

        @Override
        public DisponibilitePath as(Table<?> alias) {
            return new DisponibilitePath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<DisponibiliteRecord> getPrimaryKey() {
        return Keys.DISPONIBILITE_CC0;
    }

    @Override
    public List<ForeignKey<DisponibiliteRecord, ?>> getReferences() {
        return Arrays.asList(Keys.DISPONIBILITE__DISPONIBILITE_CR0, Keys.DISPONIBILITE__DISPONIBILITE_CR1);
    }

    private transient CoursPath _cours;

    /**
     * Get the implicit join path to the <code>cours</code> table.
     */
    public CoursPath cours() {
        if (_cours == null)
            _cours = new CoursPath(this, Keys.DISPONIBILITE__DISPONIBILITE_CR0, null);

        return _cours;
    }

    private transient ProfesseurPath _professeur;

    /**
     * Get the implicit join path to the <code>professeur</code> table.
     */
    public ProfesseurPath professeur() {
        if (_professeur == null)
            _professeur = new ProfesseurPath(this, Keys.DISPONIBILITE__DISPONIBILITE_CR1, null);

        return _professeur;
    }

    @Override
    public Disponibilite as(String alias) {
        return new Disponibilite(DSL.name(alias), this);
    }

    @Override
    public Disponibilite as(Name alias) {
        return new Disponibilite(alias, this);
    }

    @Override
    public Disponibilite as(Table<?> alias) {
        return new Disponibilite(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Disponibilite rename(String name) {
        return new Disponibilite(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Disponibilite rename(Name name) {
        return new Disponibilite(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Disponibilite rename(Table<?> name) {
        return new Disponibilite(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Disponibilite where(Condition condition) {
        return new Disponibilite(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Disponibilite where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Disponibilite where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Disponibilite where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Disponibilite where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Disponibilite where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Disponibilite where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Disponibilite where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Disponibilite whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Disponibilite whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
