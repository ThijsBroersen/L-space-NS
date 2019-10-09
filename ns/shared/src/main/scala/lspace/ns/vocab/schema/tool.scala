package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object tool extends PropertyDef(
        iri = "http://schema.org/tool",
        iris = Set("http://schema.org/tool"),
        label = "tool",
        comment = """A sub property of instrument. An object used (but not consumed) when performing instructions or a direction.""",
        `@extends` = List(instrument.property),
        `@range` = List(HowToTool.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.instrument.Properties
}