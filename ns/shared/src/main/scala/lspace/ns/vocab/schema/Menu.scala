package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Menu extends OntologyDef(
        iri = "http://schema.org/Menu",
        iris = Set("http://schema.org/Menu"),
        label = "Menu",
        comment = """A structured representation of food or drink items available from a FoodEstablishment.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val hasMenuItem = lspace.ns.vocab.schema.hasMenuItem.property
lazy val hasMenuSection = lspace.ns.vocab.schema.hasMenuSection.property
}
override lazy val properties: List[LProperty] = List(hasMenuItem, hasMenuSection)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val hasMenuItem = lspace.ns.vocab.schema.hasMenuItem.property
lazy val hasMenuSection = lspace.ns.vocab.schema.hasMenuSection.property
}
}