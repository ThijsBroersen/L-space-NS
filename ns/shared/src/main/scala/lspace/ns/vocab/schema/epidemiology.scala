package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object epidemiology
    extends PropertyDef(
      iri = "http://schema.org/epidemiology",
      iris = Set("http://schema.org/epidemiology"),
      label = "epidemiology",
      comment = """The characteristics of associated patients, such as age, gender, race etc.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
