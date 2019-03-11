package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object netWorth extends PropertyDef(
        iri = "https://schema.org/netWorth",
        iris = Set("https://schema.org/netWorth"),
        label = "netWorth",
        comment = """The total financial value of the person as calculated by subtracting assets from liabilities.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}