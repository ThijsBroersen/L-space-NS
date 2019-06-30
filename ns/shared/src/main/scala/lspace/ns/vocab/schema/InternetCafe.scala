package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object InternetCafe extends OntologyDef(
        iri = "http://schema.org/InternetCafe",
        iris = Set("http://schema.org/InternetCafe"),
        label = "InternetCafe",
        comment = """An internet cafe.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}