package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Volcano extends OntologyDef(
        iri = "http://schema.org/Volcano",
        iris = Set("http://schema.org/Volcano"),
        label = "Volcano",
        comment = """A volcano, like Fuji san.""",
        `@extends` = () => List(Landform.ontology)
       ){
}