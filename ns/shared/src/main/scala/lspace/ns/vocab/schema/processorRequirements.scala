package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object processorRequirements extends PropertyDef(
        iri = "http://schema.org/processorRequirements",
        iris = Set("http://schema.org/processorRequirements"),
        label = "processorRequirements",
        comment = """Processor architecture required to run the application (e.g. IA64).""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}