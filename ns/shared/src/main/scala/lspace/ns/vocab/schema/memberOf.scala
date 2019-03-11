package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object memberOf extends PropertyDef(
        iri = "https://schema.org/memberOf",
        iris = Set("https://schema.org/memberOf"),
        label = "memberOf",
        comment = """An Organization (or ProgramMembership) to which this Person or Organization belongs.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}