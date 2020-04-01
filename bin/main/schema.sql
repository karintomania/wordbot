DROP TABLE IF EXISTS public.word_master;
DROP SEQUENCE IF EXISTS word_master_id_seq;

CREATE TABLE public.word_master (
	id serial NOT NULL,
	word varchar NULL,
	definition varchar NULL,
	CONSTRAINT word_master_pkey PRIMARY KEY (id)
);


-- INSERT INTO public.word_master (word, definition) VALUES('transparent','adj. easy to see through' || chr(10) || 'adj. easy to detect');

INSERT INTO public.word_master (word, definition) VALUES('abundant','adj. present in large quantities');
INSERT INTO public.word_master (word, definition) VALUES('accumulate','v. to gradually collect');
INSERT INTO public.word_master (word, definition) VALUES('accurate','adj. correct; free from errors');
INSERT INTO public.word_master (word, definition) VALUES('accustomed','adj. used to something');
INSERT INTO public.word_master (word, definition) VALUES('acquire','v. to come into possession of');
INSERT INTO public.word_master (word, definition) VALUES('adamant','adj. refusing to change an opinion');
INSERT INTO public.word_master (word, definition) VALUES('adequate','adj. enough to suit your needs');
INSERT INTO public.word_master (word, definition) VALUES('adjacent','adj. close to or next to');
INSERT INTO public.word_master (word, definition) VALUES('adjust','v. to change something so it serves its purpose better');
INSERT INTO public.word_master (word, definition) VALUES('advantage','n. something that makes it easier to achieve success');
INSERT INTO public.word_master (word, definition) VALUES('advocate','v. to publicly support');
INSERT INTO public.word_master (word, definition) VALUES('adverse','adj. unfavorable; against one’s desires');
INSERT INTO public.word_master (word, definition) VALUES('aggregate','v. to combine');
INSERT INTO public.word_master (word, definition) VALUES('aggressive','adj. assertive and pushy');
INSERT INTO public.word_master (word, definition) VALUES('allocate','v. to put aside for a specific purpose');
INSERT INTO public.word_master (word, definition) VALUES('alternative','n. another option or choice');
INSERT INTO public.word_master (word, definition) VALUES('amateur','n. someone who is inexperienced or not highly skilled in a particular area');
INSERT INTO public.word_master (word, definition) VALUES('ambiguous','adj. having several potential meanings; unclear and difficult to understand');
INSERT INTO public.word_master (word, definition) VALUES('ambitious','adj. having large goals');
INSERT INTO public.word_master (word, definition) VALUES('amend','v. to change for the better; to improve');
INSERT INTO public.word_master (word, definition) VALUES('ample','adj. plentiful');
INSERT INTO public.word_master (word, definition) VALUES('anomaly','n. deviation from the norm');
INSERT INTO public.word_master (word, definition) VALUES('annual','adj. occurring yearly');
INSERT INTO public.word_master (word, definition) VALUES('antagonize','v. to tease or be hostile towards a person or group');
INSERT INTO public.word_master (word, definition) VALUES('attitude','n. manner or feeling');
INSERT INTO public.word_master (word, definition) VALUES('attribute','v. to give credit');
INSERT INTO public.word_master (word, definition) VALUES('arbitrary','adj. based on a whim or random desire');
INSERT INTO public.word_master (word, definition) VALUES('arduous','adj. requiring a lot of effort');
INSERT INTO public.word_master (word, definition) VALUES('assuage','v. to lessen a negative feeling');
INSERT INTO public.word_master (word, definition) VALUES('assume','v. to suppose without solid proof');
INSERT INTO public.word_master (word, definition) VALUES('augment','v. to increase or make larger');
INSERT INTO public.word_master (word, definition) VALUES('benefit','n. something positive or advantageous');
INSERT INTO public.word_master (word, definition) VALUES('berate','v. to scold');
INSERT INTO public.word_master (word, definition) VALUES('bestow','v. to give as a gift');
INSERT INTO public.word_master (word, definition) VALUES('boast','v. to brag or talk with excessive pride');
INSERT INTO public.word_master (word, definition) VALUES('boost','v. to help raise or increase something');
INSERT INTO public.word_master (word, definition) VALUES('brash','adj. rude and tactless');
INSERT INTO public.word_master (word, definition) VALUES('brief','adj. short (in terms of time)');
INSERT INTO public.word_master (word, definition) VALUES('brusque','adj. abrupt to the point of rudeness');
INSERT INTO public.word_master (word, definition) VALUES('cacophony','n. a harsh, unpleasant mixture of noise');
INSERT INTO public.word_master (word, definition) VALUES('cease','v. to stop');
INSERT INTO public.word_master (word, definition) VALUES('censure','v. to express strong disapproval');
INSERT INTO public.word_master (word, definition) VALUES('chronological','adj. arranged in order of time or date');
INSERT INTO public.word_master (word, definition) VALUES('clarify','v. to make clear; to remove confusion');
INSERT INTO public.word_master (word, definition) VALUES('coalesce','v. to combine or grow together');
INSERT INTO public.word_master (word, definition) VALUES('coerce','v. to force someone to do something against their will');
INSERT INTO public.word_master (word, definition) VALUES('cognizant','adj. being aware or having knowledge of something');
INSERT INTO public.word_master (word, definition) VALUES('cohesion','n. uniting; becoming one');
INSERT INTO public.word_master (word, definition) VALUES('coincide','v. to occur at the same time');
INSERT INTO public.word_master (word, definition) VALUES('collapse','v. to fall down or break down');
INSERT INTO public.word_master (word, definition) VALUES('collide','v. to hit one another with a forceful impact');
INSERT INTO public.word_master (word, definition) VALUES('commitment','n. dedication to a cause or activity');
INSERT INTO public.word_master (word, definition) VALUES('community','n. a group of people who live or work together');
INSERT INTO public.word_master (word, definition) VALUES('conceal','v. to hide');
INSERT INTO public.word_master (word, definition) VALUES('concur','v. to agree');
INSERT INTO public.word_master (word, definition) VALUES('conflict','n. a disagreement or fight');
INSERT INTO public.word_master (word, definition) VALUES('constrain','v. to restrict or repress');
INSERT INTO public.word_master (word, definition) VALUES('contemplate','v. to consider thoughtfully');
INSERT INTO public.word_master (word, definition) VALUES('continuously','v. to go on without stopping');
INSERT INTO public.word_master (word, definition) VALUES('contradict','v. to give the opposite opinion');
INSERT INTO public.word_master (word, definition) VALUES('contribute','v. to give something (usually money or time) to a common fund or cause');
INSERT INTO public.word_master (word, definition) VALUES('convey','v. to make known');
INSERT INTO public.word_master (word, definition) VALUES('copious','adj. abundant');
INSERT INTO public.word_master (word, definition) VALUES('core','adj. central; of main importance');
INSERT INTO public.word_master (word, definition) VALUES('corrode','v. to gradually wear away');
INSERT INTO public.word_master (word, definition) VALUES('cumbersome','adj. burdensome; clumsy');
INSERT INTO public.word_master (word, definition) VALUES('curriculum','n. the courses given by a school or program');
INSERT INTO public.word_master (word, definition) VALUES('data','n. facts, statistics, or pieces of information');
INSERT INTO public.word_master (word, definition) VALUES('decay','v. to decline in health or excellence');
INSERT INTO public.word_master (word, definition) VALUES('deceive','v. to trick or mislead');
INSERT INTO public.word_master (word, definition) VALUES('decipher','v. to find the meaning of');
INSERT INTO public.word_master (word, definition) VALUES('declaration','n. an announcement');
INSERT INTO public.word_master (word, definition) VALUES('decline','v. to politely refuse' || chr(10) || ' v. to deteriorate (especially in terms of health)');
INSERT INTO public.word_master (word, definition) VALUES('degrade','v. to lower in quality');
INSERT INTO public.word_master (word, definition) VALUES('demonstrate','v. to show');
INSERT INTO public.word_master (word, definition) VALUES('deny','v. to state that something isn’t true');
INSERT INTO public.word_master (word, definition) VALUES('deplete','v. to significantly decrease');
INSERT INTO public.word_master (word, definition) VALUES('deposit','v. to deliver and leave an item');
INSERT INTO public.word_master (word, definition) VALUES('desirable','adj. worth having or wanting');
INSERT INTO public.word_master (word, definition) VALUES('despise','v. to hate');
INSERT INTO public.word_master (word, definition) VALUES('detect','v. to locate something');
INSERT INTO public.word_master (word, definition) VALUES('deter','v. to discourage');
INSERT INTO public.word_master (word, definition) VALUES('deviate','v. to differ from the norm');
INSERT INTO public.word_master (word, definition) VALUES('devise','v. to plan or create');
INSERT INTO public.word_master (word, definition) VALUES('diatribe','n. a sharp criticism or attack');
INSERT INTO public.word_master (word, definition) VALUES('digress','v. to wander from the main subject');
INSERT INTO public.word_master (word, definition) VALUES('dilemma','n. a situation where one must choose between two difficult choices');
INSERT INTO public.word_master (word, definition) VALUES('diminish','v. to shrink or reduce');
INSERT INTO public.word_master (word, definition) VALUES('dispose','v. to get rid of');
INSERT INTO public.word_master (word, definition) VALUES('disproportionate','adj. too small or large when compared to something else');
INSERT INTO public.word_master (word, definition) VALUES('disrupt','v. to interrupt by causing a disturbance');
INSERT INTO public.word_master (word, definition) VALUES('distort','v. to misrepresent');
INSERT INTO public.word_master (word, definition) VALUES('distribute','v. to give portions of something');
INSERT INTO public.word_master (word, definition) VALUES('diverse','adj. showing a lot of variety');
INSERT INTO public.word_master (word, definition) VALUES('divert','v. to cause a change of course');
INSERT INTO public.word_master (word, definition) VALUES('dynamic','adj. constantly changing');
INSERT INTO public.word_master (word, definition) VALUES('ease','v. to reduce unpleasantness or difficulty');
INSERT INTO public.word_master (word, definition) VALUES('efficient','adj. maximizing productivity');
INSERT INTO public.word_master (word, definition) VALUES('eliminate','v. to remove');
INSERT INTO public.word_master (word, definition) VALUES('elite','adj. a select, above-average group');
INSERT INTO public.word_master (word, definition) VALUES('eloquent','adj. moving speech or writing');
INSERT INTO public.word_master (word, definition) VALUES('emphasize','v. to give special importance to when speaking or writing');
INSERT INTO public.word_master (word, definition) VALUES('endure','v. to suffer through something difficult with patience');
INSERT INTO public.word_master (word, definition) VALUES('enhance','v. to intensify or magnify');
INSERT INTO public.word_master (word, definition) VALUES('epitome','n. a perfect example of something');
INSERT INTO public.word_master (word, definition) VALUES('equivalent','adj. equal');
INSERT INTO public.word_master (word, definition) VALUES('erroneous','adj. incorrect');
INSERT INTO public.word_master (word, definition) VALUES('estimate','n. an approximate value');
INSERT INTO public.word_master (word, definition) VALUES('evade','v. to avoid or escape');
INSERT INTO public.word_master (word, definition) VALUES('evaluate','v. to assess');
INSERT INTO public.word_master (word, definition) VALUES('evidence','n. facts or evidence that help prove or disprove something');
INSERT INTO public.word_master (word, definition) VALUES('evolve','v. to gradually change');
INSERT INTO public.word_master (word, definition) VALUES('exemplary','adj. worthy of imitation');
INSERT INTO public.word_master (word, definition) VALUES('exclude','v. to leave out');
INSERT INTO public.word_master (word, definition) VALUES('exclusive','adj. not admitting the majority');
INSERT INTO public.word_master (word, definition) VALUES('expand','v. to increase in size');
INSERT INTO public.word_master (word, definition) VALUES('expertise','n. expert knowledge or skill in a particular field');
INSERT INTO public.word_master (word, definition) VALUES('exploit','v. to use selfishly');
INSERT INTO public.word_master (word, definition) VALUES('expose','v. to reveal or unmask');
INSERT INTO public.word_master (word, definition) VALUES('extension','n. an act of making something longer');
INSERT INTO public.word_master (word, definition) VALUES('extract','v. to get or remove something');
INSERT INTO public.word_master (word, definition) VALUES('famine','n. a time when there is an extreme lack of food');
INSERT INTO public.word_master (word, definition) VALUES('feasible','adj. possible to do');
INSERT INTO public.word_master (word, definition) VALUES('finite','adj. having an end or limits');
INSERT INTO public.word_master (word, definition) VALUES('flaw','n. a feature that ruins the perfection of something');
INSERT INTO public.word_master (word, definition) VALUES('fluctuate','v. to change continually');
INSERT INTO public.word_master (word, definition) VALUES('focus','n. the central point or idea');
INSERT INTO public.word_master (word, definition) VALUES('fortify','v. to strengthen');
INSERT INTO public.word_master (word, definition) VALUES('framework','n. a skeletal structure designed to support something');
INSERT INTO public.word_master (word, definition) VALUES('frivolous','adj. unnecessary; of little importance');
INSERT INTO public.word_master (word, definition) VALUES('function','n. a purpose natural to a person or thing');
INSERT INTO public.word_master (word, definition) VALUES('fundamental','adj. of primary importance');
INSERT INTO public.word_master (word, definition) VALUES('gap','n. a space in between two objects');
INSERT INTO public.word_master (word, definition) VALUES('garbled','adj. communication that is distorted and unclear');
INSERT INTO public.word_master (word, definition) VALUES('generate','v. to produce');
INSERT INTO public.word_master (word, definition) VALUES('grandiose','adj. pompous; overly important');
INSERT INTO public.word_master (word, definition) VALUES('hackneyed','adj. overused and unoriginal');
INSERT INTO public.word_master (word, definition) VALUES('haphazard','adj. lacking planning');
INSERT INTO public.word_master (word, definition) VALUES('harsh','adj. not gentle; unpleasant');
INSERT INTO public.word_master (word, definition) VALUES('hasty','adj. in a hurry');
INSERT INTO public.word_master (word, definition) VALUES('hazardous','adj. full of risk');
INSERT INTO public.word_master (word, definition) VALUES('hesitate','v. to pause, often due to reluctance');
INSERT INTO public.word_master (word, definition) VALUES('hierarchy','n. a ranking system');
INSERT INTO public.word_master (word, definition) VALUES('hindrance','n. something that causes delay or resistance');
INSERT INTO public.word_master (word, definition) VALUES('hollow','adj. empty inside');
INSERT INTO public.word_master (word, definition) VALUES('horror','n. an intense feeling of fear');
INSERT INTO public.word_master (word, definition) VALUES('hostile','adj. extremely unfriendly');
INSERT INTO public.word_master (word, definition) VALUES('hypothesis','n. an unproven idea that attempts to prove something');
INSERT INTO public.word_master (word, definition) VALUES('identical','adj. exactly the same');
INSERT INTO public.word_master (word, definition) VALUES('illiterate','adj. unable to read');
INSERT INTO public.word_master (word, definition) VALUES('illustrate','v. to explain by using an example');
INSERT INTO public.word_master (word, definition) VALUES('impact','n. effect or influence');
INSERT INTO public.word_master (word, definition) VALUES('impair','v. to worsen');
INSERT INTO public.word_master (word, definition) VALUES('implement','v. to carry out');
INSERT INTO public.word_master (word, definition) VALUES('imply','v. to strongly suggest');
INSERT INTO public.word_master (word, definition) VALUES('impose','v. to force upon');
INSERT INTO public.word_master (word, definition) VALUES('impoverish','v. to reduce to poverty');
INSERT INTO public.word_master (word, definition) VALUES('incentive','n. a reason to do something');
INSERT INTO public.word_master (word, definition) VALUES('incessant','adj. continuing without pause');
INSERT INTO public.word_master (word, definition) VALUES('incidental','adj. a minor part');
INSERT INTO public.word_master (word, definition) VALUES('incite','v. to urge on');
INSERT INTO public.word_master (word, definition) VALUES('inclination','n. a preference');
INSERT INTO public.word_master (word, definition) VALUES('incompetent','adj. incapable; lacking ability');
INSERT INTO public.word_master (word, definition) VALUES('inconsistent','adj. changing randomly');
INSERT INTO public.word_master (word, definition) VALUES('indefatigable','adj. untiring');
INSERT INTO public.word_master (word, definition) VALUES('indisputable','adj. not able to be challenged');
INSERT INTO public.word_master (word, definition) VALUES('ineffective','adj. not producing any major impact');
INSERT INTO public.word_master (word, definition) VALUES('inevitable','adj. unable to be avoided');
INSERT INTO public.word_master (word, definition) VALUES('infer','v. to guess based on evidence');
INSERT INTO public.word_master (word, definition) VALUES('inflate','v. to increase in size');
INSERT INTO public.word_master (word, definition) VALUES('influence','n. the ability to have an impact on something');
INSERT INTO public.word_master (word, definition) VALUES('inhibit','v. to hinder or restrain');
INSERT INTO public.word_master (word, definition) VALUES('initial','adj. the first');
INSERT INTO public.word_master (word, definition) VALUES('inquiry','n. an investigation to determine the truth');
INSERT INTO public.word_master (word, definition) VALUES('integral','adj. necessary to complete the whole');
INSERT INTO public.word_master (word, definition) VALUES('integrate','v. to combine');
INSERT INTO public.word_master (word, definition) VALUES('interpret','v. to explain the meaning of something');
INSERT INTO public.word_master (word, definition) VALUES('intervene','v. to come between people, objects, or an event and change what is happening');
INSERT INTO public.word_master (word, definition) VALUES('intrepid','adj. fearless');
INSERT INTO public.word_master (word, definition) VALUES('intricate','adj. highly detailed');
INSERT INTO public.word_master (word, definition) VALUES('invasive','adj. intrusive');
INSERT INTO public.word_master (word, definition) VALUES('investigate','v. to examine or study');
INSERT INTO public.word_master (word, definition) VALUES('irascible','adj. easy to anger');
INSERT INTO public.word_master (word, definition) VALUES('irony','n. the use of words to give a meaning opposite to their literal meaning');
INSERT INTO public.word_master (word, definition) VALUES('irresolute','adj. uncertain');
INSERT INTO public.word_master (word, definition) VALUES('jargon','n. words specific to a certain job or group');
INSERT INTO public.word_master (word, definition) VALUES('jointly','adj. together');
INSERT INTO public.word_master (word, definition) VALUES('knack','n. a special talent or skill');
INSERT INTO public.word_master (word, definition) VALUES('labor','n. work or effort');
INSERT INTO public.word_master (word, definition) VALUES('lag','v. to fall behind');
INSERT INTO public.word_master (word, definition) VALUES('lampoon','v. to mock or ridicule');
INSERT INTO public.word_master (word, definition) VALUES('languish','v. to become weak' || chr(10) || 'v. to be neglected');
INSERT INTO public.word_master (word, definition) VALUES('lecture','n. a talk given to an audience');
INSERT INTO public.word_master (word, definition) VALUES('leery','adj. wary');
INSERT INTO public.word_master (word, definition) VALUES('legitimate','adj. lawful');
INSERT INTO public.word_master (word, definition) VALUES('lenient','adj. merciful; less harsh');
INSERT INTO public.word_master (word, definition) VALUES('likely','adj. probable');
INSERT INTO public.word_master (word, definition) VALUES('ludicrous','adj. ridiculous');
INSERT INTO public.word_master (word, definition) VALUES('maintain','v. to continue at the same level');
INSERT INTO public.word_master (word, definition) VALUES('major','adj. very important');
INSERT INTO public.word_master (word, definition) VALUES('manipulate','v. to influence, especially in an unfair way');
INSERT INTO public.word_master (word, definition) VALUES('maximize','v. to increase to the greatest possible size');
INSERT INTO public.word_master (word, definition) VALUES('measure','v. to find the size and dimensions of something');
INSERT INTO public.word_master (word, definition) VALUES('mediocre','adj. ordinary, average');
INSERT INTO public.word_master (word, definition) VALUES('mend','v. to fix');
INSERT INTO public.word_master (word, definition) VALUES('method','n. a way of doing something');
INSERT INTO public.word_master (word, definition) VALUES('migrate','v. to move from one place to another');
INSERT INTO public.word_master (word, definition) VALUES('minimum','n. the smallest or lowest amount possible');
INSERT INTO public.word_master (word, definition) VALUES('misleading','adj. giving the wrong idea');
INSERT INTO public.word_master (word, definition) VALUES('modify','v. to change');
INSERT INTO public.word_master (word, definition) VALUES('morose','adj. gloomy, depressed');
INSERT INTO public.word_master (word, definition) VALUES('negligent','adj. lazy, neglectful');
INSERT INTO public.word_master (word, definition) VALUES('nonchalant','adj. indifferent, unexcited');
INSERT INTO public.word_master (word, definition) VALUES('obey','v. to follow orders or instructions');
INSERT INTO public.word_master (word, definition) VALUES('obtain','v. to get');
INSERT INTO public.word_master (word, definition) VALUES('obvious','adj. easily understood');
INSERT INTO public.word_master (word, definition) VALUES('opponent','n. someone on the opposite side for a game or contest v. to unfairly burden');
INSERT INTO public.word_master (word, definition) VALUES('oppress','v. to unfairly burden');
INSERT INTO public.word_master (word, definition) VALUES('origin','n. the source; where something began');
INSERT INTO public.word_master (word, definition) VALUES('parsimonious','adj. frugal, stingy');
INSERT INTO public.word_master (word, definition) VALUES('partake','v. to join in');
INSERT INTO public.word_master (word, definition) VALUES('partial','adj. preferring one option over others');
INSERT INTO public.word_master (word, definition) VALUES('paucity','n. something existing in very small amounts; scarcity n. the highest or most important point');
INSERT INTO public.word_master (word, definition) VALUES('peak','n. the highest or most important point');
INSERT INTO public.word_master (word, definition) VALUES('peripheral','adj. located on the side or edge');
INSERT INTO public.word_master (word, definition) VALUES('permeate','v. to penetrate or pass through');
INSERT INTO public.word_master (word, definition) VALUES('persist','v. to continue, especially when facing opposition');
INSERT INTO public.word_master (word, definition) VALUES('pertain','v. to relate');
INSERT INTO public.word_master (word, definition) VALUES('phase','n. a period or stage in a process');
INSERT INTO public.word_master (word, definition) VALUES('poll','n. a record of opinions or votes');
INSERT INTO public.word_master (word, definition) VALUES('potent','adj. powerful');
INSERT INTO public.word_master (word, definition) VALUES('pragmatic','adj. practical, sensible');
INSERT INTO public.word_master (word, definition) VALUES('praise','v. to give approval or admiration');
INSERT INTO public.word_master (word, definition) VALUES('precede','v. to come before');
INSERT INTO public.word_master (word, definition) VALUES('precise','adj. exact');
INSERT INTO public.word_master (word, definition) VALUES('prestigious','adj. having a high reputation');
INSERT INTO public.word_master (word, definition) VALUES('prevalent','adj. widespread');
INSERT INTO public.word_master (word, definition) VALUES('primary','adj. first; most important');
INSERT INTO public.word_master (word, definition) VALUES('prior','adj. previous or earlier');
INSERT INTO public.word_master (word, definition) VALUES('proceed','v. to continue doing something');
INSERT INTO public.word_master (word, definition) VALUES('progeny','n. offspring');
INSERT INTO public.word_master (word, definition) VALUES('promote','v. to further the progress of something');
INSERT INTO public.word_master (word, definition) VALUES('prosper','v. to do well');
INSERT INTO public.word_master (word, definition) VALUES('proximity','n. nearness in time or space');
INSERT INTO public.word_master (word, definition) VALUES('quarrel','n. a disagreement or fight' || chr(10) || 'v. to have an argument');
INSERT INTO public.word_master (word, definition) VALUES('range','n. the distance between two things, often the maximum and minimum');
INSERT INTO public.word_master (word, definition) VALUES('rank','n. an official position or station');
INSERT INTO public.word_master (word, definition) VALUES('rebuke','v. to sternly disapprove or reprimand');
INSERT INTO public.word_master (word, definition) VALUES('recapitulate','v. to give a brief summary');
INSERT INTO public.word_master (word, definition) VALUES('recede','v. to retreat');
INSERT INTO public.word_master (word, definition) VALUES('recommend','v. to present someone with confidence and approval');
INSERT INTO public.word_master (word, definition) VALUES('reform','v. to make changes that improve something');
INSERT INTO public.word_master (word, definition) VALUES('regulate','v. to supervise or control a process so that it functions correctly');
INSERT INTO public.word_master (word, definition) VALUES('reinforce','v. to strengthen with added support');
INSERT INTO public.word_master (word, definition) VALUES('reject','v. to say no to something that is offered');
INSERT INTO public.word_master (word, definition) VALUES('release','v. to free');
INSERT INTO public.word_master (word, definition) VALUES('rely','v. to allow to be known');
INSERT INTO public.word_master (word, definition) VALUES('reproach','v. to depend on');
INSERT INTO public.word_master (word, definition) VALUES('require','v. to express disapproval or disappointment');
INSERT INTO public.word_master (word, definition) VALUES('resent','v. to need for a specific purpose');
INSERT INTO public.word_master (word, definition) VALUES('resign','v. to feel bitterness or anger towards someone or something v. to give up an office or position');
INSERT INTO public.word_master (word, definition) VALUES('resist','v. to withstand the effect of');
INSERT INTO public.word_master (word, definition) VALUES('resolve','v. to come to a firm decision');
INSERT INTO public.word_master (word, definition) VALUES('restrict','v. to confine or keep within limits');
INSERT INTO public.word_master (word, definition) VALUES('retain','v. to continue to do something or keep something');
INSERT INTO public.word_master (word, definition) VALUES('retract','v. to draw back in');
INSERT INTO public.word_master (word, definition) VALUES('retrieve','v. to withdraw something after it’s found to be untrue');
INSERT INTO public.word_master (word, definition) VALUES('rhetorical','v. to bring back');
INSERT INTO public.word_master (word, definition) VALUES('rigid','adj. used just for style or impact');
INSERT INTO public.word_master (word, definition) VALUES('rotate','adj. stiff, unyielding');
INSERT INTO public.word_master (word, definition) VALUES('safeguard','v. to turn');
INSERT INTO public.word_master (word, definition) VALUES('scrutinize','n. something that serves as protection or ensures safety v. to very carefully examine');
INSERT INTO public.word_master (word, definition) VALUES('section','n. a part of the whole');
INSERT INTO public.word_master (word, definition) VALUES('select','v. to choose');
INSERT INTO public.word_master (word, definition) VALUES('sequence','n. things that follow each other in a certain order');
INSERT INTO public.word_master (word, definition) VALUES('severe','adj. harsh or strict');
INSERT INTO public.word_master (word, definition) VALUES('shallow','adj. grave, critical');
INSERT INTO public.word_master (word, definition) VALUES('shelter','adj. not deep');
INSERT INTO public.word_master (word, definition) VALUES('shrink','v. to protect from something harmful');
INSERT INTO public.word_master (word, definition) VALUES('significant','v. to become smaller');
INSERT INTO public.word_master (word, definition) VALUES('source','adj. important, noteworthy');
INSERT INTO public.word_master (word, definition) VALUES('sparse','n. a person, place or thing where something was obtained adj. thinly scattered');
INSERT INTO public.word_master (word, definition) VALUES('specify','v. to clearly specify which one');
INSERT INTO public.word_master (word, definition) VALUES('speculate','v. to form a theory without strong evidence');
INSERT INTO public.word_master (word, definition) VALUES('solitary','adj. alone; without others');
INSERT INTO public.word_master (word, definition) VALUES('somber','adj. gloomy; depressing');
INSERT INTO public.word_master (word, definition) VALUES('soothe','v. to calm or comfort');
INSERT INTO public.word_master (word, definition) VALUES('squalid','adj. filthy and unpleasant');
INSERT INTO public.word_master (word, definition) VALUES('stable','adj. unlikely to change or fail');
INSERT INTO public.word_master (word, definition) VALUES('stagnant','adj. sluggish; showing little movement');
INSERT INTO public.word_master (word, definition) VALUES('strategy','n. a plan to reach a desired outcome');
INSERT INTO public.word_master (word, definition) VALUES('subsequent','adj. coming after something in time');
INSERT INTO public.word_master (word, definition) VALUES('substitute','n. a person or thing acting in place of another');
INSERT INTO public.word_master (word, definition) VALUES('subtle','adj. difficult to notice right away');
INSERT INTO public.word_master (word, definition) VALUES('sufficient','adj. enough to serve a particular purpose');
INSERT INTO public.word_master (word, definition) VALUES('summarize','v. to briefly give the main points');
INSERT INTO public.word_master (word, definition) VALUES('supervise','v. to oversee work or a process');
INSERT INTO public.word_master (word, definition) VALUES('supplant','v. to take the place of something else');
INSERT INTO public.word_master (word, definition) VALUES('suspend','v. to temporarily stop' || chr(10) || 'v. to hang something from somewhere');
INSERT INTO public.word_master (word, definition) VALUES('suspicious','adj. having the belief that someone is doing something dishonest or illegal');
INSERT INTO public.word_master (word, definition) VALUES('sustain','v. to keep going');
INSERT INTO public.word_master (word, definition) VALUES('symbolic','adj. serving as a symbol');
INSERT INTO public.word_master (word, definition) VALUES('technical','adj. relating to a specific subject or craft');
INSERT INTO public.word_master (word, definition) VALUES('terminal','adj. situated at the end');
INSERT INTO public.word_master (word, definition) VALUES('tolerate','v. to put up with');
INSERT INTO public.word_master (word, definition) VALUES('transfer','v. to move from one place to another');
INSERT INTO public.word_master (word, definition) VALUES('transition','v. to change from one state or condition to another');
INSERT INTO public.word_master (word, definition) VALUES('transparent','adj. easy to see through' || chr(10) || 'adj. easy to detect');
INSERT INTO public.word_master (word, definition) VALUES('tuition','n. the fee for instruction at a school adj. not attracting attention');
INSERT INTO public.word_master (word, definition) VALUES('unobtrusive','adj. not attracting attention');
INSERT INTO public.word_master (word, definition) VALUES('unscathed','adj. unharmed');
INSERT INTO public.word_master (word, definition) VALUES('upbeat','adj. happy, optimistic');
INSERT INTO public.word_master (word, definition) VALUES('unjust','adj. unfair');
INSERT INTO public.word_master (word, definition) VALUES('vacillate','v. to waver or be indecisive');
INSERT INTO public.word_master (word, definition) VALUES('valid','adj. just; well-founded');
INSERT INTO public.word_master (word, definition) VALUES('vanish','v. to disappear quickly');
INSERT INTO public.word_master (word, definition) VALUES('vary','v. to be different from something else in a group');
INSERT INTO public.word_master (word, definition) VALUES('verdict','n. a judgement or decision');
INSERT INTO public.word_master (word, definition) VALUES('vestige','n. a small trace of something that is disappearing or has already disappeared');
INSERT INTO public.word_master (word, definition) VALUES('vial','n. a small container used to hold liquids');
INSERT INTO public.word_master (word, definition) VALUES('vilify','v. to speak poorly of; to slander');
INSERT INTO public.word_master (word, definition) VALUES('voluminous','adj. taking up a lot of space');
INSERT INTO public.word_master (word, definition) VALUES('whereas','conj. on the contrary');
INSERT INTO public.word_master (word, definition) VALUES('wholly','adv. completely');
INSERT INTO public.word_master (word, definition) VALUES('widespread','adj. occurring over a large region');
INSERT INTO public.word_master (word, definition) VALUES('wilt','v. to droop and become limp');

-- ALTER TABLE public.word_master OWNER TO shimizu;
-- GRANT ALL ON TABLE public.word_master TO shimizu;
-- GRANT ALL ON TABLE public.word_master TO words;
