package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object jobTitle extends PropertyDef(
        iri = "https://schema.org/jobTitle",
        iris = Set("https://schema.org/jobTitle"),
        label = "jobTitle",
        comment = """The job title of the person (for example, Financial Manager).""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}