package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Drug extends OntologyDef(
        iri = "http://schema.org/Drug",
        iris = Set("http://schema.org/Drug"),
        label = "Drug",
        comment = """A chemical or biologic substance, used as a medical therapy, that has a physiological effect on an organism. Here the term drug is used interchangeably with the term medicine although clinical knowledge make a clear difference between them.""",
        `@extends` = () => List(Substance.ontology)
       ){
}