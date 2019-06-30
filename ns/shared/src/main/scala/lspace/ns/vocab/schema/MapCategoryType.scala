package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MapCategoryType extends OntologyDef(
        iri = "http://schema.org/MapCategoryType",
        iris = Set("http://schema.org/MapCategoryType"),
        label = "MapCategoryType",
        comment = """An enumeration of several kinds of Map.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}