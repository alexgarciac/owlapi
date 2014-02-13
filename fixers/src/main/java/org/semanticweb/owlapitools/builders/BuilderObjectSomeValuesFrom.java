package org.semanticweb.owlapitools.builders;

import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;

/** Builder class for OWLObjectSomeValuesFrom */
public class BuilderObjectSomeValuesFrom extends
        BaseObjectBuilder<OWLObjectSomeValuesFrom, BuilderObjectSomeValuesFrom> {
    /** builder initialized from an existing object
     * 
     * @param expected
     *            the existing object
     * @param df
     *            data factory */
    public BuilderObjectSomeValuesFrom(OWLObjectSomeValuesFrom expected,
            OWLDataFactory df) {
        this(df);
        withProperty(expected.getProperty()).withRange(expected.getFiller());
    }

    /** @param df
     *            data factory */
    public BuilderObjectSomeValuesFrom(OWLDataFactory df) {
        super(df);
    }

    @Override
    public OWLObjectSomeValuesFrom buildObject() {
        return df.getOWLObjectSomeValuesFrom(property, range);
    }
}