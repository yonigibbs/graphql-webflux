/*
 * This file is generated by jOOQ.
 */
package com.yg.gqlwfdl.yg.db.information_schema.tables;


import com.yg.gqlwfdl.yg.db.information_schema.InformationSchema;
import com.yg.gqlwfdl.yg.db.information_schema.tables.records.TablePrivilegesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablePrivileges extends TableImpl<TablePrivilegesRecord> {

    private static final long serialVersionUID = 1258640347;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES</code>
     */
    public static final TablePrivileges TABLE_PRIVILEGES = new TablePrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TablePrivilegesRecord> getRecordType() {
        return TablePrivilegesRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.GRANTOR</code>.
     */
    public final TableField<TablePrivilegesRecord, String> GRANTOR = createField("GRANTOR", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.GRANTEE</code>.
     */
    public final TableField<TablePrivilegesRecord, String> GRANTEE = createField("GRANTEE", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public final TableField<TablePrivilegesRecord, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    public final TableField<TablePrivilegesRecord, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.TABLE_NAME</code>.
     */
    public final TableField<TablePrivilegesRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public final TableField<TablePrivilegesRecord, String> PRIVILEGE_TYPE = createField("PRIVILEGE_TYPE", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public final TableField<TablePrivilegesRecord, String> IS_GRANTABLE = createField("IS_GRANTABLE", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES</code> table reference
     */
    public TablePrivileges() {
        this(DSL.name("TABLE_PRIVILEGES"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES</code> table reference
     */
    public TablePrivileges(String alias) {
        this(DSL.name(alias), TABLE_PRIVILEGES);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES</code> table reference
     */
    public TablePrivileges(Name alias) {
        this(alias, TABLE_PRIVILEGES);
    }

    private TablePrivileges(Name alias, Table<TablePrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TablePrivileges(Name alias, Table<TablePrivilegesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TablePrivileges(Table<O> child, ForeignKey<O, TablePrivilegesRecord> key) {
        super(child, key, TABLE_PRIVILEGES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablePrivileges as(String alias) {
        return new TablePrivileges(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablePrivileges as(Name alias) {
        return new TablePrivileges(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TablePrivileges rename(String name) {
        return new TablePrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TablePrivileges rename(Name name) {
        return new TablePrivileges(name, null);
    }
}