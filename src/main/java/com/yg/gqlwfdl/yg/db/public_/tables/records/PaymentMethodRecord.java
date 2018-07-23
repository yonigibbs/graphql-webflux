/*
 * This file is generated by jOOQ.
 */
package com.yg.gqlwfdl.yg.db.public_.tables.records;


import com.yg.gqlwfdl.yg.db.public_.tables.PaymentMethod;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PaymentMethodRecord extends UpdatableRecordImpl<PaymentMethodRecord> implements Record3<Long, String, Double> {

    private static final long serialVersionUID = -388004183;

    /**
     * Setter for <code>PUBLIC.PAYMENT_METHOD.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.PAYMENT_METHOD.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.PAYMENT_METHOD.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.PAYMENT_METHOD.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.PAYMENT_METHOD.CHARGE</code>.
     */
    public void setCharge(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.PAYMENT_METHOD.CHARGE</code>.
     */
    public Double getCharge() {
        return (Double) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, Double> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, Double> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PaymentMethod.PAYMENT_METHOD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PaymentMethod.PAYMENT_METHOD.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return PaymentMethod.PAYMENT_METHOD.CHARGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component3() {
        return getCharge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getCharge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentMethodRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentMethodRecord value2(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentMethodRecord value3(Double value) {
        setCharge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentMethodRecord values(Long value1, String value2, Double value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentMethodRecord
     */
    public PaymentMethodRecord() {
        super(PaymentMethod.PAYMENT_METHOD);
    }

    /**
     * Create a detached, initialised PaymentMethodRecord
     */
    public PaymentMethodRecord(Long id, String description, Double charge) {
        super(PaymentMethod.PAYMENT_METHOD);

        set(0, id);
        set(1, description);
        set(2, charge);
    }
}
