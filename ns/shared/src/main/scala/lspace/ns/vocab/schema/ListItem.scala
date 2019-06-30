package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ListItem extends OntologyDef(
        iri = "http://schema.org/ListItem",
        iris = Set("http://schema.org/ListItem"),
        label = "ListItem",
        comment = """An list item, e.g. a step in a checklist or how-to description.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}