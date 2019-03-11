package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object accessModeSufficient extends PropertyDef(
        iri = "https://schema.org/accessModeSufficient",
        iris = Set("https://schema.org/accessModeSufficient"),
        label = "accessModeSufficient",
        comment = """A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Expected values include:  auditory, tactile, textual, visual.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}