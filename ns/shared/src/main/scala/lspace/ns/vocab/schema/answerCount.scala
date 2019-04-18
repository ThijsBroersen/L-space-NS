package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object answerCount extends PropertyDef(
        iri = "http://schema.org/answerCount",
        iris = Set("http://schema.org/answerCount"),
        label = "answerCount",
        comment = """The number of answers this question has received.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}