package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object spatialCoverage extends PropertyDef(
        iri = "https://schema.org/spatialCoverage",
        iris = Set("https://schema.org/spatialCoverage"),
        label = "spatialCoverage",
        comment = """The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
      contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
      areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.""",
        `@extends` = () => List(contentLocation),
        `@range` = () => List(Place)
       ){

override lazy val properties: List[Property] = List()
trait Properties extends lspace.ns.vocab.schema.contentLocation.Properties
}