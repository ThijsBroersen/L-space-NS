package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Clip extends OntologyDef(
        iri = "http://schema.org/Clip",
        iris = Set("http://schema.org/Clip"),
        label = "Clip",
        comment = """A short TV or radio program or a segment/part of a program.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val clipNumber = lspace.ns.vocab.schema.clipNumber.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val endOffset = lspace.ns.vocab.schema.endOffset.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val partOfEpisode = lspace.ns.vocab.schema.partOfEpisode.property
lazy val partOfSeason = lspace.ns.vocab.schema.partOfSeason.property
lazy val partOfSeries = lspace.ns.vocab.schema.partOfSeries.property
lazy val startOffset = lspace.ns.vocab.schema.startOffset.property
}
override lazy val properties: List[LProperty] = List(actor, clipNumber, director, endOffset, musicBy, partOfEpisode, partOfSeason, partOfSeries, startOffset)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val clipNumber = lspace.ns.vocab.schema.clipNumber.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val endOffset = lspace.ns.vocab.schema.endOffset.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val partOfEpisode = lspace.ns.vocab.schema.partOfEpisode.property
lazy val partOfSeason = lspace.ns.vocab.schema.partOfSeason.property
lazy val partOfSeries = lspace.ns.vocab.schema.partOfSeries.property
lazy val startOffset = lspace.ns.vocab.schema.startOffset.property
}
}