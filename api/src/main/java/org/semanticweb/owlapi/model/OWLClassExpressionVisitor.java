package org.semanticweb.owlapi.model;
/*
 * Copyright (C) 2006, University of Manchester
 *
 * Modifications to the initial code base are copyright of their
 * respective authors, or their employers as appropriate.  Authorship
 * of the modifications may be determined from the ChangeLog placed at
 * the end of this file.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */


/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 13-Nov-2006<br><br>
 * </p>
 * An interface to objects that can visit {@link org.semanticweb.owlapi.model.OWLClassExpression}s.
 * (See the <a href="http://en.wikipedia.org/wiki/Visitor_pattern">Visitor Patterns</a>)
 *
 */
public interface OWLClassExpressionVisitor {

    void visit(OWLClass desc);

    void visit(OWLObjectIntersectionOf desc);

    void visit(OWLObjectUnionOf desc);

    void visit(OWLObjectComplementOf desc);

    void visit(OWLObjectSomeValuesFrom desc);

    void visit(OWLObjectAllValuesFrom desc);

    void visit(OWLObjectHasValue desc);

    void visit(OWLObjectMinCardinality desc);

    void visit(OWLObjectExactCardinality desc);

    void visit(OWLObjectMaxCardinality desc);

    void visit(OWLObjectHasSelf desc);

    void visit(OWLObjectOneOf desc);

    void visit(OWLDataSomeValuesFrom desc);

    void visit(OWLDataAllValuesFrom desc);

    void visit(OWLDataHasValue desc);

    void visit(OWLDataMinCardinality desc);

    void visit(OWLDataExactCardinality desc);

    void visit(OWLDataMaxCardinality desc);


}
