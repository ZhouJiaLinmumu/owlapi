package org.semanticweb.owlapi.profiles;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@SuppressWarnings("javadoc")
@RunWith(Parameterized.class)
public class ProfileRLDLOnlyTestCase extends ProfileBase {

    private final String premise;

    public ProfileRLDLOnlyTestCase(String premise) {
        this.premise = premise;
    }

    @Test
    public void testRLDLOnly() {
        test(premise, false, false, true, true);
    }

    @Parameters
    public static List<String> getData() {
        return Arrays.asList(
            "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:j.0=\"http://owl2.test/rules/\"><owl:Ontology /><owl:InverseFunctionalProperty rdf:about=\"http://owl2.test/rules/ifp\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#ObjectProperty\"/></owl:InverseFunctionalProperty><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/Y2\"><j.0:ifp><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/X2\"/></j.0:ifp></owl:NamedIndividual><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/X1\"/><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/Y1\"><owl:differentFrom rdf:resource=\"http://owl2.test/rules/Y2\"/><j.0:ifp rdf:resource=\"http://owl2.test/rules/X1\"/></owl:NamedIndividual></rdf:RDF>",
            "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" ><owl:Ontology /><owl:Class rdf:about=\"http://owl2.test/rules#Cb\"/><owl:NamedIndividual rdf:about=\"http://owl2.test/rules#X\"/><owl:NamedIndividual rdf:about=\"http://owl2.test/rules#Y\"/><rdf:Description><rdfs:subClassOf rdf:resource=\"http://owl2.test/rules#Cb\"/><owl:oneOf rdf:parseType=\"Collection\"><owl:NamedIndividual rdf:about=\"http://owl2.test/rules#X\"/><owl:NamedIndividual rdf:about=\"http://owl2.test/rules#Y\"/></owl:oneOf></rdf:Description></rdf:RDF>",
            "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" ><owl:Ontology /><owl:Class rdf:about=\"http://owl2.test/rules#C\"><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"http://owl2.test/rules#op\"/></owl:onProperty><owl:allValuesFrom><owl:Class rdf:about=\"http://owl2.test/rules#C1\"/></owl:allValuesFrom></owl:Restriction></rdfs:subClassOf></owl:Class></rdf:RDF>",
            "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:j.0=\"http://owl2.test/rules/\"><owl:Ontology /><owl:FunctionalProperty rdf:about=\"http://owl2.test/rules/fp\"><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#ObjectProperty\"/></owl:FunctionalProperty><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/Y2\"><j.0:fp><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/X2\"/></j.0:fp></owl:NamedIndividual><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/X1\"><owl:differentFrom rdf:resource=\"http://owl2.test/rules/X2\"/></owl:NamedIndividual><owl:NamedIndividual rdf:about=\"http://owl2.test/rules/Y1\"><j.0:fp rdf:resource=\"http://owl2.test/rules/X1\"/></owl:NamedIndividual></rdf:RDF>",
            "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"  xmlns:first=\"urn:test#\" xmlns:second=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:DatatypeProperty rdf:about=\"urn:test#p\"><rdfs:range rdf:resource=\"http://www.w3.org/2001/XMLSchema#byte\" /></owl:DatatypeProperty></rdf:RDF>",
            "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"  xml:base=\"urn:test\"><owl:Ontology/><owl:DatatypeProperty rdf:about=\"urn:test#p\"><rdfs:range rdf:resource=\"http://www.w3.org/2001/XMLSchema#short\" /></owl:DatatypeProperty></rdf:RDF>",
            "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"  xml:base=\"urn:test\"><owl:Ontology/><owl:DatatypeProperty rdf:about=\"urn:test#p\"><rdfs:range rdf:resource=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\" /><rdfs:range rdf:resource=\"http://www.w3.org/2001/XMLSchema#nonPositiveInteger\" /></owl:DatatypeProperty></rdf:RDF>",
            "<rdf:RDF xml:base=\"http://example.org/\" xmlns=\"http://example.org/\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"fatherOf\" /><owl:Class rdf:about=\"Woman\" /><rdf:Description rdf:about=\"Peter\"><fatherOf rdf:resource=\"Stewie\" /><fatherOf rdf:resource=\"Meg\" /></rdf:Description><Woman rdf:about=\"Meg\" /><rdf:Description rdf:about=\"Peter\"><rdf:type><owl:Restriction><owl:onProperty rdf:resource=\"fatherOf\" /><owl:maxQualifiedCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxQualifiedCardinality><owl:onClass rdf:resource=\"Woman\" /></owl:Restriction></rdf:type></rdf:Description><rdf:Description rdf:about=\"Stewie\"><owl:differentFrom rdf:resource=\"Meg\" /></rdf:Description></rdf:RDF>",
            "Prefix( :=<http://example.org/> ) Ontology( Declaration( ObjectProperty( :fatherOf ) ) Declaration( Class( :Woman ) ) ObjectPropertyAssertion( :fatherOf :Peter :Stewie ) ObjectPropertyAssertion( :fatherOf :Peter :Meg ) ClassAssertion( :Woman :Meg ) ClassAssertion( ObjectMaxCardinality( 1 :fatherOf :Woman ) :Peter ) DifferentIndividuals( :Stewie :Meg ))",
            "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:hasAge)) Declaration(Class(:Eighteen)) SubClassOf(DataHasValue(:hasAge \"18\"^^xsd:integer) :Eighteen) ClassAssertion(DataHasValue(:hasAge \"18\"^^xsd:integer) :a) ClassAssertion(ObjectComplementOf(:Eighteen) :a))",
            "Prefix(:=<http://example.org/>)\nPrefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:a)) Declaration(DataProperty(:dp)) Declaration(Class(:A)) SubClassOf(:A DataHasValue(:dp \"18\"^^xsd:integer)) ClassAssertion(:A :a) ClassAssertion(DataAllValuesFrom(:dp xsd:integer) :a))",
            "Prefix(owl:=<http://www.w3.org/2002/07/owl#>)\nPrefix(rdf:=<http://www.w3.org/1999/02/22-rdf-syntax-ns#>)\nPrefix(xml:=<http://www.w3.org/XML/1998/namespace>)\nPrefix(xsd:=<http://www.w3.org/2001/XMLSchema#>)\nPrefix(rdfs:=<http://www.w3.org/2000/01/rdf-schema#>) Ontology(\n Declaration(DataProperty(<http://www.w3.org/2002/03owlt/I5.8/premises008#p>))\n DataPropertyRange(<http://www.w3.org/2002/03owlt/I5.8/premises008#p> xsd:short))",
            "Prefix(:=<http://example.org/>) Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>) Ontology( Declaration(NamedIndividual(:Meg)) Declaration(DataProperty(:numberOfChildren)) DataPropertyAssertion(:numberOfChildren :Meg \"+0.0\"^^xsd:float) DataPropertyAssertion(:numberOfChildren :Meg \"-0.0\"^^xsd:float) FunctionalDataProperty(:numberOfChildren))",
            "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:InverseFunctionalProperty rdf:about=\"http://www.example.org#p\"/><rdf:Description rdf:about=\"http://www.example.org#x1\"><ex:p rdf:resource=\"http://www.example.org#y\"/></rdf:Description><rdf:Description rdf:about=\"http://www.example.org#x2\"><ex:p rdf:resource=\"http://www.example.org#y\"/></rdf:Description></rdf:RDF>",
            "<rdf:RDF xml:base=\"urn:test\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"><owl:Ontology rdf:about=\"\"/><owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass><owl:Class rdf:about=\"urn:test#c1\"/></owl:equivalentClass></owl:Class><owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf><owl:Class><owl:complementOf><owl:Class rdf:about=\"urn:test#d\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class><owl:Class rdf:about=\"urn:test#d\"/><owl:Class rdf:about=\"urn:test#f\"><rdfs:subClassOf><owl:Class rdf:about=\"urn:test#d\"/></rdfs:subClassOf></owl:Class><owl:Class rdf:about=\"urn:test#c1\"><rdfs:subClassOf><owl:Class rdf:about=\"urn:test#d1\"/></rdfs:subClassOf><rdfs:subClassOf><owl:Class><owl:complementOf><owl:Class rdf:about=\"urn:test#d1\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class><owl:Class rdf:about=\"urn:test#d1\"/><owl:Class rdf:about=\"urn:test#e3\"><rdfs:subClassOf><owl:Class rdf:about=\"urn:test#c\"/></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>",
            "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:j.0=\"http://owl2.test/rules#\"><owl:Ontology /><owl:ObjectProperty rdf:about=\"http://owl2.test/rules#op\"/><owl:NamedIndividual rdf:about=\"http://owl2.test/rules#I\"/><owl:NamedIndividual><j.0:op rdf:resource=\"http://owl2.test/rules#I\"/></owl:NamedIndividual></rdf:RDF>",
            "<rdf:RDF xml:base=\"urn:test\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"><owl:Ontology rdf:about=\"\"/><owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass><owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Class rdf:about=\"urn:test#c\"/><owl:Class rdf:about=\"urn:test#d\"/></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class><owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf><owl:Class><owl:complementOf><owl:Class rdf:about=\"urn:test#d\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class><owl:Class rdf:about=\"urn:test#d\"/><owl:Class rdf:about=\"urn:test#f\"><rdfs:subClassOf><owl:Class rdf:about=\"urn:test#d\"/></rdfs:subClassOf></owl:Class><owl:Class rdf:about=\"urn:test#c1\"><rdfs:subClassOf><owl:Class rdf:about=\"urn:test#d1\"/></rdfs:subClassOf><rdfs:subClassOf><owl:Class><owl:complementOf><owl:Class rdf:about=\"urn:test#d1\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class><owl:Class rdf:about=\"urn:test#d1\"/><owl:Class rdf:about=\"urn:test#e3\"><rdfs:subClassOf><owl:Class rdf:about=\"urn:test#c\"/></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>",
            "<rdf:RDF xml:base=\"urn:test\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"><owl:Ontology rdf:about=\"\"/><owl:Class rdf:about=\"urn:test#Unsatisfiable\"><owl:equivalentClass><owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Class rdf:about=\"urn:test#e3\"/><owl:Class rdf:about=\"urn:test#f\"/></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class><owl:Class rdf:about=\"urn:test#c\"><rdfs:subClassOf><owl:Class><owl:complementOf><owl:Class rdf:about=\"urn:test#d\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class><owl:Class rdf:about=\"urn:test#d\"/><owl:Class rdf:about=\"urn:test#f\"><rdfs:subClassOf><owl:Class rdf:about=\"urn:test#d\"/></rdfs:subClassOf></owl:Class><owl:Class rdf:about=\"urn:test#c1\"><rdfs:subClassOf><owl:Class rdf:about=\"urn:test#d1\"/></rdfs:subClassOf><rdfs:subClassOf><owl:Class><owl:complementOf><owl:Class rdf:about=\"urn:test#d1\"/></owl:complementOf></owl:Class></rdfs:subClassOf></owl:Class><owl:Class rdf:about=\"urn:test#d1\"/><owl:Class rdf:about=\"urn:test#e3\"><rdfs:subClassOf><owl:Class rdf:about=\"urn:test#c\"/></rdfs:subClassOf></owl:Class><owl:ObjectProperty rdf:about=\"urn:test#r\"/><rdf:Description><rdf:type rdf:resource=\"urn:test#Unsatisfiable\"/></rdf:Description></rdf:RDF>");
    }
}
