package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Action extends OntologyDef(
        iri = "http://schema.org/Action",
        iris = Set("http://schema.org/Action"),
        label = "Action",
        comment = """An action performed by a direct agent and indirect participants upon a direct object. Optionally happens at a location with the help of an inanimate instrument. The execution of the action may produce a result. Specific action sub-type documentation specifies the exact expectation of each argument/role.<br/><br/>

See also <a href="http://blog.schema.org/2014/04/announcing-schemaorg-actions.html">blog post</a> and <a href="http://schema.org/docs/actions.html">Actions overview document</a>.""",
        `@extends` = () => List(Thing.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Thing.Properties{
lazy val agent = lspace.ns.vocab.schema.agent.property
lazy val endTime = lspace.ns.vocab.schema.endTime.property
lazy val location = lspace.ns.vocab.schema.location.property
lazy val error = lspace.ns.vocab.schema.error.property
lazy val startTime = lspace.ns.vocab.schema.startTime.property
lazy val participant = lspace.ns.vocab.schema.participant.property
lazy val `object` = lspace.ns.vocab.schema.`object`.property
lazy val actionStatus = lspace.ns.vocab.schema.actionStatus.property
lazy val target = lspace.ns.vocab.schema.target.property
lazy val instrument = lspace.ns.vocab.schema.instrument.property
}
override lazy val properties: List[LProperty] = List(agent, endTime, location, error, startTime, participant, `object`, actionStatus, target, instrument)
trait Properties extends lspace.ns.vocab.schema.Thing.Properties{
lazy val agent = lspace.ns.vocab.schema.agent.property
lazy val endTime = lspace.ns.vocab.schema.endTime.property
lazy val location = lspace.ns.vocab.schema.location.property
lazy val error = lspace.ns.vocab.schema.error.property
lazy val startTime = lspace.ns.vocab.schema.startTime.property
lazy val participant = lspace.ns.vocab.schema.participant.property
lazy val `object` = lspace.ns.vocab.schema.`object`.property
lazy val actionStatus = lspace.ns.vocab.schema.actionStatus.property
lazy val target = lspace.ns.vocab.schema.target.property
lazy val instrument = lspace.ns.vocab.schema.instrument.property
}
}