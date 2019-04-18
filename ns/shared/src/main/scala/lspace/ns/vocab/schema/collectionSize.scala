package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object collectionSize extends PropertyDef(
        iri = "http://schema.org/collectionSize",
        iris = Set("http://schema.org/collectionSize"),
        label = "collectionSize",
        comment = """The number of items in the <a class="localLink" href="http://schema.org/Collection">Collection</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(Integer.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}