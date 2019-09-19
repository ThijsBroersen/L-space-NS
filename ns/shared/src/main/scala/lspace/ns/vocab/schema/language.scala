package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object language extends PropertyDef(
        iri = "http://schema.org/language",
        iris = Set("http://schema.org/language"),
        label = "language",
        comment = """A sub property of instrument. The language used on this action.""",
        `@extends` = () => List(instrument.property),
        `@range` = () => List(Language.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.instrument.Properties
}