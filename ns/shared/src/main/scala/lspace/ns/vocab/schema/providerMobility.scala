package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object providerMobility extends PropertyDef(
        iri = "http://schema.org/providerMobility",
        iris = Set("http://schema.org/providerMobility"),
        label = "providerMobility",
        comment = """Indicates the mobility of a provided service (e.g. 'static', 'dynamic').""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}