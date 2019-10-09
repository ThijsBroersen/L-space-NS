package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object rxcui extends PropertyDef(
        iri = "http://schema.org/rxcui",
        iris = Set("http://schema.org/rxcui"),
        label = "rxcui",
        comment = """The RxCUI drug identifier from RXNORM.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}