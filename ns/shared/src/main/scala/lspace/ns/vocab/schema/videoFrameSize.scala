package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object videoFrameSize extends PropertyDef(
        iri = "http://schema.org/videoFrameSize",
        iris = Set("http://schema.org/videoFrameSize"),
        label = "videoFrameSize",
        comment = """The frame size of the video.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}