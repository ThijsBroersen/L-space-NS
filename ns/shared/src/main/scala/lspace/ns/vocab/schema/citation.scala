package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object citation extends PropertyDef(
        iri = "https://schema.org/citation",
        iris = Set("https://schema.org/citation"),
        label = "citation",
        comment = """A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}