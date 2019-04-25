package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object honorificPrefix
    extends PropertyDef(
      iri = "http://schema.org/honorificPrefix",
      iris = Set("http://schema.org/honorificPrefix"),
      label = "honorificPrefix",
      comment = """An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
