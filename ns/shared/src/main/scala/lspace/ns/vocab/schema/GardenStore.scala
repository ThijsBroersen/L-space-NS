package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GardenStore extends OntologyDef(
        iri = "http://schema.org/GardenStore",
        iris = Set("http://schema.org/GardenStore"),
        label = "GardenStore",
        comment = """A garden store.""",
        `@extends` = () => List(Store.ontology)
       ){
}