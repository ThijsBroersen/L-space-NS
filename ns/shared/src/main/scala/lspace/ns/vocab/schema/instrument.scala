package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object instrument extends PropertyDef(
        iri = "http://schema.org/instrument",
        iris = Set("http://schema.org/instrument"),
        label = "instrument",
        comment = """The object that helped the agent perform the action. e.g. John wrote a book with <em>a pen</em>.""",
        `@extends` = () => List(),
        `@range` = () => List(Thing.ontology)
       ){
}