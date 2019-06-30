package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AutoPartsStore extends OntologyDef(
        iri = "http://schema.org/AutoPartsStore",
        iris = Set("http://schema.org/AutoPartsStore"),
        label = "AutoPartsStore",
        comment = """An auto parts store.""",
        `@extends` = () => List(Store.ontology, AutomotiveBusiness.ontology)
       ){
}