package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object programmingLanguage extends PropertyDef(
        iri = "http://schema.org/programmingLanguage",
        iris = Set("http://schema.org/programmingLanguage"),
        label = "programmingLanguage",
        comment = """The computer programming language.""",
        `@extends` = List(),
        `@range` = List(ComputerLanguage.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}