package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Locksmith extends OntologyDef(
        iri = "http://schema.org/Locksmith",
        iris = Set("http://schema.org/Locksmith"),
        label = "Locksmith",
        comment = """A locksmith.""",
        `@extends` = () => List(HomeAndConstructionBusiness.ontology)
       ){
}