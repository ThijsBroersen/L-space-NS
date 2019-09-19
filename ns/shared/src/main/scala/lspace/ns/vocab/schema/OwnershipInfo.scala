package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OwnershipInfo extends OntologyDef(
        iri = "http://schema.org/OwnershipInfo",
        iris = Set("http://schema.org/OwnershipInfo"),
        label = "OwnershipInfo",
        comment = """A structured value providing information about when a certain organization or person owned a certain product.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val acquiredFrom = lspace.ns.vocab.schema.acquiredFrom.property
lazy val ownedFrom = lspace.ns.vocab.schema.ownedFrom.property
lazy val ownedThrough = lspace.ns.vocab.schema.ownedThrough.property
lazy val typeOfGood = lspace.ns.vocab.schema.typeOfGood.property
}
override lazy val properties: List[LProperty] = List(acquiredFrom, ownedFrom, ownedThrough, typeOfGood)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val acquiredFrom = lspace.ns.vocab.schema.acquiredFrom.property
lazy val ownedFrom = lspace.ns.vocab.schema.ownedFrom.property
lazy val ownedThrough = lspace.ns.vocab.schema.ownedThrough.property
lazy val typeOfGood = lspace.ns.vocab.schema.typeOfGood.property
}
}