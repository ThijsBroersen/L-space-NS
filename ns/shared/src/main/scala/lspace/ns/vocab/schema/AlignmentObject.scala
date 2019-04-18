package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AlignmentObject extends OntologyDef(
        iri = "http://schema.org/AlignmentObject",
        iris = Set("http://schema.org/AlignmentObject"),
        label = "AlignmentObject",
        comment = """An intangible item that describes an alignment between a learning resource and a node in an educational framework.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val educationalFramework = lspace.ns.vocab.schema.educationalFramework.property
lazy val alignmentType = lspace.ns.vocab.schema.alignmentType.property
lazy val targetName = lspace.ns.vocab.schema.targetName.property
lazy val targetUrl = lspace.ns.vocab.schema.targetUrl.property
}
override lazy val properties: List[LProperty] = List(educationalFramework, alignmentType, targetName, targetUrl)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val educationalFramework = lspace.ns.vocab.schema.educationalFramework.property
lazy val alignmentType = lspace.ns.vocab.schema.alignmentType.property
lazy val targetName = lspace.ns.vocab.schema.targetName.property
lazy val targetUrl = lspace.ns.vocab.schema.targetUrl.property
}
}