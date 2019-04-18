package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object videoFormat extends PropertyDef(
        iri = "http://schema.org/videoFormat",
        iris = Set("http://schema.org/videoFormat"),
        label = "videoFormat",
        comment = """The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}