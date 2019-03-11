package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object hasPOS extends PropertyDef(
        iri = "https://schema.org/hasPOS",
        iris = Set("https://schema.org/hasPOS"),
        label = "hasPOS",
        comment = """Points-of-Sales operated by the organization or person.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}